# Installing
First download and open with intellij.
Then compile and run the `buildLib` gradle task.
Next move the `TVM` and `t2lc` jars from their individual
`build/distributions` folders
in each submodule. Make sure the dependencies are either on classpath or
in the same folder as the jars. The `src/dist` contents should be copied
to where the jars are.

Alternatively the `src/test/t2l/test.t2l` is compiled and ran on test.
You can edit that file to try out the language.

Later the build task will package all necessary files together.

# Running
To use, run `t2lc` with the specified aruments to create `.t2lc` and
`.t2lm` files. Then run `TVM` with a `.t2lc` file.