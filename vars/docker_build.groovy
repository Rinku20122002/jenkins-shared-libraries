def call(String ProjectName, String ImageTag, String DockerUser){
    sh "docker build -t ${DockerUser}/${ProjectName}:${ImageTag} ."
}
