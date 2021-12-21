import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int month,day;
        Scanner input =new Scanner(System.in);
        System.out.print("Which month:");
        month= input.nextInt();
        System.out.print("Day:");
        day=input.nextInt();
        if(12>=month&&31>=day){
        if(month==3){
            if(day>=21){
                System.out.println("Aires");
            }else{
                System.out.println("Pisces");
            }
        }
        if(month==4){
            if(day>=21){
                System.out.println("Taurus");
            }else{
                System.out.println("Aries");
            }
        }
        if(month==5){
            if(day>=22){
                System.out.println("Gemini");
            }else{
                System.out.println("Taurus");
            }
        }
        if(month==6){
            if(day>=22){
                System.out.println("Cancer");
            }else {
                System.out.println("Gemini");
            }
        }
        if(month==7){
            if(day>=23){
                System.out.println("Leo");
            }else {
                System.out.println("Cancer");
            }
        }
        if(month==8){
            if(day>=22){
                System.out.println("Virgo");
            }else{
                System.out.println("leo");
            }
        }
        if (month==9){
            if(day>=24){
                System.out.println("Libra");
            }else{
                System.out.println("Virgo");
            }
        }
        if(month==10){
            if(day>=24){
                System.out.println("Scorpio");
            }else{
                System.out.println("Libra");
            }
        }
        if(month==11){
            if(day>=23){
                System.out.println("Sagittarius");
            }else{
                System.out.println("Scorpio");
            }
        }
        if(month==12){
            if(day>=23){
                System.out.println("Capricorn");
            }else{
                System.out.println("Sagittarius");
            }
        }
        if(month==1){
            if(day>=21){
                System.out.println("Aquarius");
            }else {
                System.out.println("Capricorn");
            }
        }
        if(month==2){
            if(day>=20){
                System.out.println("Pisces");
            }else {
                System.out.println("Aquarius");
            }
        }
        }else {
            System.out.println("wrong day or month");
        }




    }
}
