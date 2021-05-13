package School;

public class Teacher extends SchoolClass{
    
    public Teacher(int id, String name, char gender){
        super(id, name, gender);
    }

    @Override
    public String schoolNameCard(int id, String name, char gender){
        result += id + name + gender;
        System.out.println("결과 : " + result);
        return result;
    }

    @Override
    public int personGender(char gender){
        if(gender == 'm' || gender == 'M'){
            System.out.println("남자 선생님 입니다.");
            return 1;
        } else if (gender == 'g' || gender == 'G'){
            System.out.println("여자 선생님 입니다.");
            return 2;
        } else {
            System.out.println("남자와 여자를 제외한 성별은 불가합니다.");
            return 0;
        }
    }
}
