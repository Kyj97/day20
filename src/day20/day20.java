package day20;

import java.util.Objects;
import java.util.Scanner;


public class day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        	System.out.printf("���� %d������ ���ϸ��� �����Ǿ����ϴ�.\n", Pokemon.count);
            System.out.print("1) ���ϸ� ���� 2) ���α׷� ���� : ");
            String menu = sc.nextLine();
            if (Objects.equals(menu, "1")) {
                System.out.print("1) ��ī�� 2) ���α� 3) ���̸� : ");
                String pokemon = sc.nextLine();
                if (Objects.equals(pokemon, "1")) {
                	 System.out.print("�÷��̾� �̸� �Է� : ");
                     String name = sc.nextLine();
                     System.out.print("��� ������ ��� �Է�(/�� �����Ͽ� �Է�) : ");
                     String skill = sc.nextLine();
                    Pikachu Pika = new Pikachu(name, skill);
                    Pika.info();
                    System.out.print("���� ��ȣ ���� : ");
                    int att = sc.nextInt();
                    Pika.attack(att);
                    sc.nextLine();
                }else if (Objects.equals(pokemon, "2")) {
               	 	System.out.print("�÷��̾� �̸� �Է� : ");
                    String name = sc.nextLine();
                    System.out.print("��� ������ ��� �Է�(/�� �����Ͽ� �Է�) : ");
                    String skill = sc.nextLine();
                    Ggoboogi Ggobu = new Ggoboogi(name, skill);
                   Ggobu.info();
                   System.out.print("���� ��ȣ ���� : ");
                   int att = sc.nextInt();
                   Ggobu.attack(att);
                   sc.nextLine();
                }
                else if (Objects.equals(pokemon, "3")) {
               	 	System.out.print("�÷��̾� �̸� �Է� : ");
                    String name = sc.nextLine();
                    System.out.print("��� ������ ��� �Է�(/�� �����Ͽ� �Է�) : ");
                    String skill = sc.nextLine();
                    Pairi Pai = new Pairi(name, skill);
                    Pai.info();
                   System.out.print("���� ��ȣ ���� : ");
                   int att = sc.nextInt();
                   Pai.attack(att);
                   sc.nextLine();
                }
                else {
                    System.out.println("�޴����� ��� �ּ���.");
                }
            }
                else if (Objects.equals(menu, "2")) {
                    System.out.println("���α׷��� �����մϴ�.");
                    break;
                } else {
                    System.out.println("�޴����� ��� �ּ���.");
                }


            }

        }
    }

