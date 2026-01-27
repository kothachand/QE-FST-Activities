public class activity5 {
    public static class Mybook extends abstracta{
        @Override
        public void settitle(String title){
            this.title=title;
        }
    }

    public static void main(String[] args) {
        String t="Newbook";
        Mybook b=new Mybook();
        b.settitle("Newbook");
        String ti=b.gettitle();
        System.out.println(ti);
       
    }
}
