package programmer.zaman.now.data;

//atribut parameter di record adalah final, jadi tidak bisa di override atau diubah menggunakan method this
public record LoginRequest(String username, String password)
{
    public LoginRequest {
        System.out.println("Membuat Object Login Request");
    }

    public LoginRequest (String username){
        this(username, "");
    }

    public LoginRequest ()
    {
        this("","");
    }

}
