public class fuzzy {
    public static void main(String[] args) {
        int w = 1000;
        System.out.println(estimate(w));
    }
    static String estimate(int weight){
        if(weight<0) return "INVALID INPUT";
        else if(weight==0) return "Time eastimate 0min";
        else if(weight>=1 && weight<=2000) return"Time estimated 25min";
        else if(weight>=2001 && weight<=4000) return "TIme 35min";
        else if(weight>=4001 && weight<=7000) return "45min";
        else if(weight>7000) return "Overload";
        else return "Invalid ";
    }
}
