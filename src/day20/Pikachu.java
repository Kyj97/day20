package day20;

class Pikachu extends Pokemon {
    private String name = "��ī��";
    public Pikachu() { }
    public Pikachu(String owner, String skill) {
    	this.owner = owner;
    	this.skill = skill;
    	this.skills = skill.split("/");
    	System.out.println(name);
    	count = count + 1 ;
    }
    	
    public void attack(int a) {
        System.out.printf("[��ī��ī]%s�� %s�� %s ����(����) ����!\n", owner, name, skills[a-1]);
    }
}