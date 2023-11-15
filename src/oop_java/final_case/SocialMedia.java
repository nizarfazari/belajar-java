package oop_java.final_case;

public class SocialMedia {
    String name;

    final void login(String username, String password){

    }
}





final class Faceebook extends SocialMedia {

    // ini akan error karena method di atas final tidak dapat di overrider
//    void login(String username,String password){
//
//    }
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();
        socialMedia.name = "asd";
        System.out.println(socialMedia.name);
    }
}


// error karena class facebook adalah final jadi tidak dapat di wariskan
//class FakeFacebook extends Faceebook {
//
//}

