public class User {
    private int _id;
    private String _fullname;
    private String _email;

    public User(int id,String fullname, String email){
//        _id=id;
//        _fullname=fullname;
//        _email=email;
        set_id(id);
        set_fullname(fullname);
        set_email(email);

    }

    void set_id(int id){
        _id=id;
    }

    int get_userId(){
        return _id;
    }

    void set_fullname(String fullname){
        _fullname=fullname;
    }

    String get_fullname(){
        return _fullname;
    }

    void set_email(String email){
        _email=email;
    }

    String get_email(){
        return _email;
    }

    public String displayUserDetails(){
        return "Id: "+_id+"\nFullname: "+_fullname+"\nEmail: "+_email;
    }
}
