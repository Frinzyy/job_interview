package com.jobtracker.model;

public class Company {
        private String name;
        private String location;
        private String website;

        public Company(String name, String location, String website){
            this.name = name;
            this.location = location;
            this.website = website;
        }
    
        public String getName() {
            return name;
        }
        public String getLocation(){
            return location;
        }
        public String getWebsite(){
            return website;
        }
        public void setName(String newName){
            this.name = newName;
        }
        public void setLocation(String newLocation){
            this.location = newLocation;
        }
        public void setWebseite(String newWebseite){
            this.website = newWebseite;
        }
}
