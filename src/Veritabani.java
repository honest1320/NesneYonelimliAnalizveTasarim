import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Veritabani {
    boolean flag = false;

    
    private Connection Baglan(){

        Connection conn=null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "1320");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    private static Veritabani instance;
    public static Veritabani getInstance(){
    	try {
            if (instance == null) {
                instance = new Veritabani();
            } else if (instance.Baglan().isClosed()) {
                instance = new Veritabani();
            }
            return instance;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return instance;
    }

    public boolean Kontrol(String KullaniciAdi , String Sifre)
    {
        String sql= "SELECT * FROM \"public\".\"users\"";
        String isim = "";
        String sifre = "";

        Connection conn=this.Baglan();
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            conn.close();

            while(rs.next())
            {
                isim = rs.getString("user_name");
                sifre = rs.getString("passcode");

                if (isim.equals(KullaniciAdi) && sifre.equals(Sifre)) {
                    flag=true;
                }
            }
            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }
}