enablePlugins(SbtTwirl)

scalaVersion := "3.1.2"

libraryDependencies := libraryDependencies.value.map {
  case module if module.name == "twirl-api" =>
    module.cross(CrossVersion.for3Use2_13)
  case module => module
}
