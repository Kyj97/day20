package day20;

import java.util.Objects;
import java.util.Scanner;


public class day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        	System.out.printf("현재 %d마리의 포켓몬이 생성되었습니다.\n", Pokemon.count);
            System.out.print("1) 포켓몬 생성 2) 프로그램 종료 : ");
            String menu = sc.nextLine();
            if (Objects.equals(menu, "1")) {
                System.out.print("1) 피카츄 2) 꼬부기 3) 파이리 : ");
                String pokemon = sc.nextLine();
                if (Objects.equals(pokemon, "1")) {
                	 System.out.print("플레이어 이름 입력 : ");
                     String name = sc.nextLine();
                     System.out.print("사용 가능한 기술 입력(/로 구분하여 입력) : ");
                     String skill = sc.nextLine();
                    Pikachu Pika = new Pikachu(name, skill);
                    Pika.info();
                    System.out.print("공격 번호 선택 : ");
                    int att = sc.nextInt();
                    Pika.attack(att);
                    sc.nextLine();
                }else if (Objects.equals(pokemon, "2")) {
               	 	System.out.print("플레이어 이름 입력 : ");
                    String name = sc.nextLine();
                    System.out.print("사용 가능한 기술 입력(/로 구분하여 입력) : ");
                    String skill = sc.nextLine();
                    Ggoboogi Ggobu = new Ggoboogi(name, skill);
                   Ggobu.info();
                   System.out.print("공격 번호 선택 : ");
                   int att = sc.nextInt();
                   Ggobu.attack(att);
                   sc.nextLine();
                }
                else if (Objects.equals(pokemon, "3")) {
               	 	System.out.print("플레이어 이름 입력 : ");
                    String name = sc.nextLine();
                    System.out.print("사용 가능한 기술 입력(/로 구분하여 입력) : ");
                    String skill = sc.nextLine();
                    Pairi Pai = new Pairi(name, skill);
                    Pai.info();
                   System.out.print("공격 번호 선택 : ");
                   int att = sc.nextInt();
                   Pai.attack(att);
                   sc.nextLine();
                }
                else {
                    System.out.println("메뉴에서 골라 주세요.");
                }
            }
                else if (Objects.equals(menu, "2")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else {
                    System.out.println("메뉴에서 골라 주세요.");
                }


            }

        }
    }

