package day20;

class Ggoboogi extends Pokemon {
    private String name = "���α�";
    public Ggoboogi () { }
    public Ggoboogi (String owner, String skill) {
    	this.owner = owner;
    	this.skill = skill;
    	this.skills = skill.split("/");
        System.out.println(name);
        count = count + 1 ;
    }
    public void attack(int a){

        System.out.printf("[���ϲ���]%s�� %s�� %s ����(��) ����!\n", owner, name, skills[a-1]);
    }
}