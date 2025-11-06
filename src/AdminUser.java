public class AdminUser extends User{
     private int id;
     private String role;

     public AdminUser(int id,String role,String fullname,String email){
         super(id,fullname,email);
         id=id;
         role=role;

     }
}
