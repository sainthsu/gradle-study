import org.gradle.api.Rule

class HttpPingRule impements Rule {
	Strign getDescription() {
		'Rule Usage: ...'
	}

	void apply(String taskName) {
		if (taskName.startsWith('ping')) {
			project.task(taskName) {
				ext.hostname = taskName - 'ping'
				doLast {
					println "PING ${ext.hostname}"
				}
			}
		}
	}
}
