package day20;

class Pikachu extends Pokemon {
    private String name = "피카츄";
    public Pikachu() { }
    public Pikachu(String owner, String skill) {
    	this.owner = owner;
    	this.skill = skill;
    	this.skills = skill.split("/");
    	System.out.println(name);
    	count = count + 1 ;
    }
    	
    public void attack(int a) {
        System.out.printf("[피카피카]%s의 %s가 %s 공격(전기) 시전!\n", owner, name, skills[a-1]);
    }
}