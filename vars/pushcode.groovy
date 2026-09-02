def call (String projectname, String imagetag, String dockerhubuser){
   echo 'The image is being pushed to Docker Hub'

    withCredentials([
        usernamePassword(
            credentialsId: 'mustagi',
            passwordVariable: 'dockerhubpass',
            usernameVariable: 'dockerhubuser'
        )
    ]) {
        sh 'docker login -u $dockerhubuser -p $dockerhubpass'
    }
     //   sh 'docker image tag notes-app:latest $dockerhubuser/notes-app:latest'
        sh 'docker push ${dockerhubuser}/${projectname}:${imagetag}'
    
}
