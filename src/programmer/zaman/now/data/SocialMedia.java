package programmer.zaman.now.data;

class SocialMedia {
    String name;

}

class Facebook extends SocialMedia{

    void login(String username, String password){
        System.out.println("login...");
    }
}


class FakeFacebook extends Facebook{

    void login(String username, String password){
        System.out.println("Fake login...");
    }
}
