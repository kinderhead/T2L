# Installing
First download and open with intellij.
Run the `assembleDist` gradle task twice. (It is strange)
Then run `build.py`. In the `out` folder will be all files
and dependencies.

Alternatively the `src/test/t2l/test.t2l` is compiled and ran on test.
You can edit that file to try out the language.

# Running
To use, run `t2lc` with the specified aruments to create `.t2lc` and
`.t2lm` files. Then run `tvm` with a `.t2lc` file.