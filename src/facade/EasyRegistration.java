package facade;

public class EasyRegistration {
    Registration registration;

    public EasyRegistration(Registration registration) {
        this.registration = registration;
    }

    public void regNumber(String regno){
        registration.setFirstCharacter(regno.charAt(0));
        registration.setSecondCharacter(regno.charAt(1));
        registration.setThirdCharacter(regno.charAt(2));
        registration.setFurthCharacter(regno.charAt(3));
        registration.setFifthCharacter(regno.charAt(4));
        registration.setSixCharacter(regno.charAt(5));
    }

    public  String getRegNo(){
        return registration.getRegNo();
    }
}
