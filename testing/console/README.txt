This is completely independent of Gradle and shows how you can use the
ConsoleLauncher to run tests. (Note: it is much better to use Gradle,
Maven or Ant instead of this approach!)

Run the tests with

  ./runtests

ConsoleLauncher command line options can be passed to the script; for
example, you can reduce the amount of output with

  ./runtests --details=summary

or suppress everything except reporting of failed tests with

  ./runtests --details=none
