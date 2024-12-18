package pl_java.exercise_2;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;

public class Profile {
/*
 * Attributes
 */
    private String name;
    private String countryCode;
    private String phoneNo;
    private URI profilePhotoUrl;
    private String about;
    private LocalDateTime lastSeen;

/*
 * Contructors
 */
   public Profile(String name,String countryCode, String phoneNo, String profilePhotoUrl ) throws URISyntaxException{
        setName(name);
        setPhoneNo(countryCode, phoneNo);
        setProfilePhotoUrl(profilePhotoUrl);
        this.lastSeen = LocalDateTime.now();
   }    

   public Profile(String name, String countryCode, String phoneNo) throws URISyntaxException {
        setName(name);
        setPhoneNo(countryCode, phoneNo);
        setProfilePhotoUrl("https://pss.whatsapp.net/v/noDP.jpg");
        this.lastSeen = LocalDateTime.now();
        setAbout("Hey there ! I am using WhatsApp.");
   }


    public String getName() {
        return name;
        }

        public String getCountryCode() {
                return countryCode;
        }

        public String getPhoneNo() {
                return phoneNo;
        }

        public String getProfilePhotoUrl() {
                return profilePhotoUrl.toString();
        }

        public String getAbout() {
                return about;
        }

        public LocalDateTime getLastSeen() {
                return lastSeen;
        }

        public void setName(String name){
                if(name.isBlank()){
                        System.out.println("Error : name can not be blank");
                }
                else{
                   this.name = name;
                }
        }

        public void setPhoneNo(String countryCode, String phoneNo){
                if (phoneNo.length()!=10){
                        System.out.println("Error : Phone Number must be 10 digit only");
                }
                else{
                        this.countryCode = countryCode;
                        this.phoneNo = phoneNo;
                }
        }

        public void setProfilePhotoUrl(String profilePhotoUrl) throws URISyntaxException{
                this.profilePhotoUrl = new URI(profilePhotoUrl);
        }

        public void setAbout(String about){

                if (about.isBlank()){
                 System.out.println("Error : about can not be blank");
                }
                else{
                        this.about = about;
                }
        }

        /*
        * Methods
        */
        public void updateLastSeen(LocalDateTime lastSeen){
                if (this.lastSeen.isAfter(lastSeen)){
                        System.out.println("Error : Current lastSeen can not be more than input lastseen!");
                }
                else{
                        this.lastSeen = lastSeen;
                }
        }
}