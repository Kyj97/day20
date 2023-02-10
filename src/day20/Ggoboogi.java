package day20;

class Ggoboogi extends Pokemon {
    private String name = "部何扁";
    public Ggoboogi () { }
    public Ggoboogi (String owner, String skill) {
    	this.owner = owner;
    	this.skill = skill;
    	this.skills = skill.split("/");
        System.out.println(name);
        count = count + 1 ;
    }
    public void attack(int a){

        System.out.printf("[部合部合]%s狼 %s啊 %s 傍拜(拱) 矫傈!\n", owner, name, skills[a-1]);
    }
}