from zipfile import ZipFile
from pathlib import Path
import glob
import os
import shutil

def write(name, txt):
    with open(name, "wb") as f:
        f.write(txt)

def read(name):
    with open(name, "rb") as f:
        return f.read()

def getBuild(fname):
    name = os.path.basename(os.path.splitext(fname)[0])
    with ZipFile(fname, "r") as f:
        for i in f.namelist():
            if not os.path.basename(i):
                continue
            if i.startswith(name + "/bin"):
                continue

            if i.startswith(name + "/"):
                print("Copying " + i)
                zf = f.open(i)
                if "t2lc" in os.path.basename(i):
                    target = open(os.path.join("out", "t2lc.jar"), "wb")
                elif "TVM" in os.path.basename(i):
                    target = open(os.path.join("out", "tvm.jar"), "wb")
                else:
                    target = open(os.path.join("out", os.path.basename(i)), "wb")
                with zf, target:
                    shutil.copyfileobj(zf, target)
        #f.extractall()

Path("out").mkdir(parents=True, exist_ok=True)
print("Getting t2lc")
getBuild(glob.glob("t2lc/build/distributions/*.zip")[0])

print("\nGetting tvm")
getBuild(glob.glob("TVM/build/distributions/*.zip")[0])

print("\nMoving stdlib")
Path("out/stdlib").mkdir(parents=True, exist_ok=True)
for root, dirs, files in os.walk("src/dist/stdlib"):
    for i in files:
        print("Copying " + os.path.join(root, i).replace("\\", "/"))
        shutil.copy(os.path.join(root, i), os.path.join("out/stdlib", i))
