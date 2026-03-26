package facade;

public class Registration {
    private char regNo[] = new char[6];
    public void setFirstCharacter(char ch){
        regNo[0] = ch;
    }
    public void setSecondCharacter(char ch){
        regNo[1] = ch;
    }
    public void setThirdCharacter(char ch){
        regNo[2] = ch;
    }
    public void setFurthCharacter(char ch){
        regNo[3] = ch;
    }
    public void setFifthCharacter(char ch){
        regNo[4] = ch;
    }
    public void setSixCharacter(char ch){
        regNo[5] = ch;
    }
    public  String getRegNo(){
        return new String(regNo);
    }
}
