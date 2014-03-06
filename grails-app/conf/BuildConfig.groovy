grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.plugin.location.'transmart-java' = '/Users/weymouth/home/working/TranSmart/github/Transmart/transmart-extensions/transmart-java'

grails.plugin.location.'biomart-domain' = '/Users/weymouth/home/working/TranSmart/github/Transmart/transmart-extensions/biomart-domain'


grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
	legacyResolve false
    repositories {
         grailsCentral()
        mavenCentral()
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.13'
    }
    plugins {
		build(":release:2.2.1",
			":rest-client-builder:1.0.3") {
		export = false}
        compile ':biomart-domain:1.0-SNAPSHOT'
        compile ':transmart-java:1.0-SNAPSHOT'
    }
}
