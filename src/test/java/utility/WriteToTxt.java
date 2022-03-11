package utility;
import pojos.Registrant;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class WriteToTxt {
    public static void generateData(Registrant registrant, String fileName){

        //utilities icinde, sonradan kullanilabilecek bir durumsa try catch, hata verirse de devam ediyor
        //file class icinde ise tekrar kullanima gerek yoksa exception
        try {
            FileWriter fileWriter = new FileWriter(fileName, false);//filewriter creates the file, default is false
            //true adds the new record, false deletes the old record
            BufferedWriter writer = new BufferedWriter(fileWriter);//bufferwriter: this creates the records in the file

            //sadece data yi okuyacagiz onun icin getter ini kulllaniyoruz
            writer.append(registrant.getFirstName()+","+registrant.getLastName()+","+registrant.getLogin()+","+registrant.getSsn()+"\n");
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //main method is just as an example
//    public static void main(String[] args) {
//        Registrant registrant = new Registrant();
//        registrant.setFirstName("Tugba");
//        String fileName = "./src/test/java/test_data/medunna_registrant_info.txt";
//        generateData(registrant, fileName);
//    }
}