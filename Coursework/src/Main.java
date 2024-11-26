public class Main {
    public static void main(String[] args) {
        //Create array of names and IDs
        String[] allNames = {"Orlando","Anthony","Giovanna","Alex","Chris","Gabriella","Nate","Laila"};
        int[] allStudentIDs = {1,2,3,4,5,6,7,8};

        //New list of members
        ExpeditionMember[] members;
        int noOfMembers = 4 + (int)(Math.random()*3);//Random number between 4 and 6
        members = new ExpeditionMember[noOfMembers];

        boolean[] selected = new boolean[allNames.length];//Tracking of selected members to makes sure that the same doesn't get picked more than once
        int assignedCount = 0;

        while (assignedCount < noOfMembers) {
            int randomIndex = (int) (Math.random() * allNames.length);//Random student picked

            if (!selected[randomIndex]) { // If not selected
                selected[randomIndex] = true; // Mark as selected
                members[assignedCount] = new ExpeditionMember(allNames[randomIndex], allStudentIDs[randomIndex]); //Create an object
                assignedCount++;
            }
        }

        //Creating both expeditions
        ResearchExpedition pyramidExpedition = new ResearchExpedition(members[0],members[1],members[2]);
        ResearchExpedition nileExpedition = new ResearchExpedition(members[members.length-3],members[members.length-2],members[members.length-1]);

        //Printing the names from each expedition
        System.out.println(pyramidExpedition.getExpeditionLeaderName() + " " + pyramidExpedition.getArchivistName() + " " + pyramidExpedition.getFieldResearcherName());
        System.out.println(nileExpedition.getExpeditionLeaderName() + " " + nileExpedition.getArchivistName() + " " +  nileExpedition.getFieldResearcherName());
        
        if (ExpeditionMember.member_counter == members.length){
            System.out.println("SUCCESS");
        }
    }
}