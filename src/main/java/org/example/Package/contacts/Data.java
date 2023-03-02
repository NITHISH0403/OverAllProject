package org.example.Package.contacts;

class Data {
    Data next = null;
    String name;
    long phone;
    String email;

    public Data(String nm, long ph, String eid){
        setDetails(nm, ph, eid);
    }
    void setDetails(String nm, long ph, String eid) {
        name = nm;
        phone = ph;
        email = eid;
    }
}