package day20;

class Pokemon {
	  public static int count = 0;
	    int idx = 0;
	    protected String owner =null ;
	    protected String[] skills ;
	    protected String skill ;

	    public  Pokemon() {
	    	System.out.print("포켓몬 생성:");
	    }
	    public Pokemon (String owner, String skill, int idx) {
	        this.owner = owner;
	        this.skills = skill.split("/");
	        this.idx = idx ;
	        System.out.print("포켓몬 생성:");
	        count = count + 1 ;
	    }
	    public void info() {
	        System.out.printf("%s의 포켓몬이 사용 가능한 스킬\n", owner);
	        for (int i = 0; i < skills.length; i++) {
	            System.out.printf("%d : %s\n", i + 1, skills[i]);
	        }
	    }
	    public void attack(int a){
	        System.out.printf("%s 공격 시전!", skills[a-1]);
	    }
	        
}
