def call(String ProjectName, String ImageTag, String DockerUser){
  sh"docker build -t ${DockerHubUser}/${ProjectName}":${ImageTag} ."
}
