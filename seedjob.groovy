// seedjob.groovy

def create_pipeline(String name, String gitUrl) {
    pipelineJob(name) {
        triggers {
            githubPush()
        }
        definition {
            cpsScm {
                scm {
                    git {
                        remote {
                            url(gitUrl)
                        }
                        branches('*/main')
                        scriptPath('Jenkinsfile')
                    }
                }
            }
        }
    }
}

create_pipeline('pipeline_lesson10', 'https://github.com/mbps54/web_app.git')
