package banking_management_system1;

public class CreateAccounts {

    int acnum, pass;
    String name;
    int phn;
    String email, address, actype, rel;
    int depositeBal, avail;

    CreateAccounts(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public CreateAccounts(String name, int depositeBal, int avail) {
        this.name = name;
        this.depositeBal = depositeBal;
        this.avail = avail;
    }

    CreateAccounts(int acnum, int pass, String name, int phn, String email, String address, String actype, String rel, int depositeBal, int avail) {
        this.acnum = acnum;
        this.pass = pass;
        this.name = name;
        this.phn = phn;
        this.email = email;
        this.address = address;
        this.actype = actype;
        this.rel = rel;
        this.depositeBal = depositeBal;
        this.avail = avail;
    }

    public int getAcnum() {
        return acnum;
    }

    public void setAcnum(int acnum) {
        this.acnum = acnum;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhn() {
        return phn;
    }

    public void setPhn(int phn) {
        this.phn = phn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getActype() {
        return actype;
    }

    public void setActype(String actype) {
        this.actype = actype;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public int getDepositeBal() {
        return depositeBal;
    }

    public void setDepositeBal(int depositeBal) {
        this.depositeBal = depositeBal;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    @Override
    public String toString() {
        return "CreateAccounts{" + "acnum=" + acnum + ", pass=" + pass + ", name=" + name + ", phn=" + phn + ", email=" + email + ", address=" + address + ", actype=" + actype + ", rel=" + rel + ", depositeBal=" + depositeBal + ", avail=" + avail + '}';
    }
}
