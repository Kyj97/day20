package day20;

class Pairi extends Pokemon {
    private String name = "���̸�";
    public Pairi () { }
    public Pairi (String owner, String skill) {
    	this.owner = owner;
    	this.skill = skill;
    	this.skills = skill.split("/");
        System.out.println(name);
        count = count + 1 ;
    }
    public void attack(int a){
        System.out.printf("[��������]%s�� %s�� %s ����(��) ����!\n",owner, name, skills[a-1]);
    }
}