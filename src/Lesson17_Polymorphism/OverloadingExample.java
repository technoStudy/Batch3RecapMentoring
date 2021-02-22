package Lesson17_Polymorphism;

public class OverloadingExample {

    public static void main(String[] args) {
        SignInWithCredentials signInWithCredentials = new SignInWithCredentials();
        SignInWithGoogle signInWithGoogle = new SignInWithGoogle();
        SignInWithFacebook signInWithFacebook = new SignInWithFacebook();

        SignIn userSignIn = new SignIn();
        userSignIn.signIn(signInWithFacebook);

    }

}


class SignIn {
    public void signIn(SignInWithCredentials signInWithCredentials){
        System.out.println("You have sign in with your username and password.");
    }

    public void sigIn(SignInWithGoogle signInWithGoogle){
        System.out.println("You have sign in with your Google account.");
    }

    public void signIn(SignInWithFacebook signInWithFacebook){
        System.out.println("You have sign in with your Facebook account.");
    }
}

class SignInWithCredentials {
    /*
    some codes here
     */
}

class SignInWithGoogle{
        /*
    some codes here
     */
}

class SignInWithFacebook{
            /*
    some codes here
     */
}

