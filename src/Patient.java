
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo-ideaPad-15isk
 */
public class Patient {

    public int num;
    public String firstName;
    public String surname;
    public String lastName;
    public long egn;
    public long phone;
    public String gender;
    public String address;
    public String bloodType;
    public String allergies;
    public String chronicIllnesses;
    public Image image;
    public Blob blob;
    public String date;
    public String diseases;
    public String doctor;
    public String therapy;
    public String vaccines;

    public int getNum() {

        return this.num;

    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getfirstName() {

        return this.firstName;
    }

    public void setfirstName(String fName) {

        this.firstName = fName;
    }

    public String getSurname() {

        return this.surname;
    }

    public void setSurname(String sName) {

        this.surname = sName;
    }

    public String getLastName() {

        return this.lastName;
    }

    public void setLastName(String lName) {

        this.lastName = lName;
    }

    public long getEGN() {

        return egn;
    }

    public void setEGN(long egn) {

        this.egn = egn;
    }

    public long getPhone() {

        return phone;
    }

    public void setPhone(long phone) {

        this.phone = phone;
    }

    public String getGender() {

        return this.gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public String getAddress() {

        return this.address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getBloodType() {

        return this.bloodType;
    }

    public void setBloodType(String BloodType) {

        this.bloodType = BloodType;
    }

    public String getAllergies() {

        return this.allergies;
    }

    public void setAllergies(String Allergies) {

        this.allergies = Allergies;
    }

    public String getChronicIllnesses() {

        return this.chronicIllnesses;
    }

    public void setChronicIllnesses(String ChronicIllnesses) {

        this.chronicIllnesses = ChronicIllnesses;
    }

    public Image setImage(Blob blob) throws SQLException {

        BufferedImage image = null;
        try (InputStream is = blob.getBinaryStream()) {
            image = ImageIO.read(is);
            this.image = image;
        } catch (IOException exp) {
            exp.printStackTrace();
        }
        return null;
    }

    public Image getImage() throws SQLException {

        return this.image;
    }

    public String getDate() {

        return this.date;

    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDiseases() {

        return this.diseases;

    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public String getDoctor() {

        return this.doctor;

    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getTherapy() {

        return this.therapy;

    }

    public void setTherapy(String therapy) {
        this.therapy = therapy;
    }

    public String getVaccines() {

        return this.vaccines;

    }

    public void setVaccines(String vaccines) {
        this.vaccines = vaccines;
    }

}
