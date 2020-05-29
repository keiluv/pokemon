import java.util.Scanner;

abstract class pokemon{
    public String name;

    public void nawara(){
        System.out.println("나와라!"+name);
    }

    abstract void attack();//공격
    abstract void evolve();//진화
    
}

//파이리 클래스
class Charmander extends pokemon{
    Charmander(){
        this.name = "파이리";
    }
    int AP;//공격력
    int DP;//방어력
    int HP;//체력

    void attack(){
        System.out.println("화염방사!");
    }
    void evolve(){
        System.out.println("리자드 진화!");
        AP+=100;
        DP+=100;
        HP+=50;
    }
}

//꼬부기 클래스
class Squirtle extends pokemon{
    Squirtle(){
        this.name = "꼬부기";
    }
    
    int AP;//공격력
    int DP;//방어력
    int HP;//체력

    void attack(){
        System.out.println("아쿠아테일!");
    }
    void evolve(){
        System.out.println("어니부기 진화!");
        AP+=100;
        DP+=100;
        HP+=50;
    }
}

//이상해씨 클래스
class Bulbasaur extends pokemon{
    Bulbasaur(){
        this.name = "이상해씨";
    }

    int AP;//공격력
    int DP;//방어력
    int HP;//체력


    void attack(){
        System.out.println("씨폭탄!");
    }
    void evolve(){
        System.out.println("이상해풀 진화!");
        AP+=100;
        DP+=100;
        HP+=50;
    }
}

class Main {
    public static void pogo(String po1){

        //변수선언
        Squirtle sq= new Squirtle();
        Charmander ch = new Charmander();
        Bulbasaur bu = new Bulbasaur();

        //입력갚에 따라 출력문 변경
        switch(po1){
            case "ch":
                ch.nawara();
                ch.AP = 100;
                ch.DP = 100;
                ch.HP = 100;
                System.out.println("공격력"+ch.AP+"방어력"+ch.DP+"체력"+ch.HP);
                ch.attack();
                ch.evolve();
                System.out.println("공격력"+ch.AP+"방어력"+ch.DP+"체력"+ch.HP);
                break;
            case "sq":
                sq.nawara();
                sq.AP = 100;
                sq.DP = 100;
                sq.HP = 100;
                System.out.println("공격력"+sq.AP+"방어력"+sq.DP+"체력"+sq.HP);
                sq.attack();
                sq.evolve();
                System.out.println("공격력"+sq.AP+"방어력"+sq.DP+"체력"+sq.HP);     
                break;
            case "bu":
                bu.nawara();
                bu.AP = 100;
                bu.DP = 100;
                bu.HP = 100;
                System.out.println("공격력"+bu.AP+"방어력"+bu.DP+"체력"+bu.HP);
                ch.attack();
                ch.evolve();
                System.out.println("공격력"+bu.AP+"방어력"+bu.DP+"체력"+bu.HP);
                break;                
        }
        
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("첫번째 플레이어의 포켓몬을 고르시오.");
        System.out.println("파이리:ch,꼬부기:sq,이상해씨:bu");
        String pokemon1 = scan.next();

        //메서드 호출
        pogo(pokemon1);

        scan.close();
    }
}