package day20;

class Pairi extends Pokemon {
    private String name = "파이리";
    public Pairi () { }
    public Pairi (String owner, String skill) {
    	this.owner = owner;
    	this.skill = skill;
    	this.skills = skill.split("/");
        System.out.println(name);
        count = count + 1 ;
    }
    public void attack(int a){
        System.out.printf("[파윌파윌]%s의 %s가 %s 공격(불) 시전!\n",owner, name, skills[a-1]);
    }
}