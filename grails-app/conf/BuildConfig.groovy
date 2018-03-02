grails.project.work.dir = 'target'

grails.project.dependency.resolver = 'maven'
grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		mavenLocal() // Note: use 'grails maven-install' to install required plugins locally
		grailsCentral()
		mavenCentral()
		mavenRepo 'https://repo.transmartfoundation.org/content/repositories/public/'
	}

	plugins {
		compile ':biomart-domain:18.1-SNAPSHOT'
		compile ':transmart-java:18.1-SNAPSHOT'

		build ':release:3.1.2', ':rest-client-builder:2.1.1', {
			export = false
		}
	}
}
