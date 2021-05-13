package School;

public class SchoolClass {
    public int id;
    public String name;
    public char gender;
    public String result;

    public SchoolClass(int id, String name, char gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String schoolNameCard(int id, String name, char gender){
        result += id + name + gender;
        System.out.println("결과 : " + result);
        return result;
    }

    public int personGender(char gender){
        if(gender == 'm' || gender == 'M'){
            System.out.println("남자입니다.");
            return 1;
        } else if (gender == 'g' || gender == 'G'){
            System.out.println("여자입니다.");
            return 2;
        } else {
            System.out.println("남자와 여자를 제외한 성별은 불가합니다.");
            return 0;
        }
    }
}
