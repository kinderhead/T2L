# Installing
First download and open with intellij.
Then compile and run the `buildLib` gradle task.
Next move the `TVM` and `t2lc` jars from their individual `build/libs` folders
in each submodule. Make sure the dependencies are either on classpath or
in the same folder as the jars.

Later the build task will package all necessary files together.
# Running
To use, run `t2lc` with the specified aruments to create `.t2lc` and
`.t2lm` files. Then run `TVM` with a `.t2lc` file