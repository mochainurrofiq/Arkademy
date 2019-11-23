package pkg1;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
public class Main {

    public static void main(String[] args) {
              
        JSONObject name = new JSONObject();
        name.put("name","Mochammad Ainur Rofiq");
               
        JSONObject age = new JSONObject();
        age.put("age", "21");
        
        JSONObject address = new JSONObject();
        address.put("Dusun", "Lebaksari");
        address.put("Desa", "Karangjati");
        address.put("Kecamatan", "Pandaan");
        address.put("Kabupaten", "Pasuruan");
        address.put("Provinsi", "Jawa Timur");
        
        JSONObject hobbies = new JSONObject();
        hobbies.put("1","olahraga");
        hobbies.put("2", "baca buku");
        
        JSONObject marriage = new JSONObject();
        marriage.put("is_marriage", "false");
          
        JSONObject list_school = new JSONObject();
        list_school.put("2003-2009","SDN Karangjati 02");
        list_school.put("2009-2012","MTs Darut Taqwa 02");
        list_school.put("2012-2015","MA Darut Taqwa (B. Arab)");
        
        JSONObject Skill = new JSONObject();
        Skill.put("java","beginner");
        
        JSONObject interest = new JSONObject();
        interest.put("interesting_in_coding", "true");
               
        JSONArray data = new JSONArray();
        data.add(name);
        data.add(age);
        data.add("address"+address);
        data.add("hobbies"+hobbies);
        data.add(marriage);
        data.add("list school"+list_school);
        data.add("skills"+Skill);
        data.add(interest);
        
        System.out.println(data);
       
        
        
    }
    
}
