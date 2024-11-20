public class Main {
    public static void main(String[] args) {
        String[] allNames = {"Orlando","Anthony","Giovanna","Alex","Chris","Gabriella","Nate","Laila"};
        int[] allStudentIDs = {1,2,3,4,5,6,7,8};

        ExpeditionMember[] members;
        int noOfMembers = 4 + (int)(Math.random()*3);
        members = new ExpeditionMember[noOfMembers];

        boolean[] selected = new boolean[allNames.length];

        int assignedCount = 0;

        while (assignedCount < noOfMembers) {
            int randomIndex = (int) (Math.random() * allNames.length);

            if (!selected[randomIndex]) { // If not already selected
                selected[randomIndex] = true; // Mark as selected
                members[assignedCount] = new ExpeditionMember(allNames[randomIndex], allStudentIDs[randomIndex]);
                assignedCount++; // Increment the count of assigned members
            }
        }

        ResearchExpedition pyramidExpedition = new ResearchExpedition(members[0],members[1],members[2]);
        ResearchExpedition nileExpedition = new ResearchExpedition(members[members.length-3],members[members.length-2],members[members.length-1]);

        System.out.println(pyramidExpedition.getExpeditionLeaderName() + pyramidExpedition.getArchivistName() + pyramidExpedition.getFieldResearcherName());
        System.out.println(nileExpedition.getExpeditionLeaderName() + nileExpedition.getArchivistName() + nileExpedition.getFieldResearcherName());

        if (ExpeditionMember.member_counter == members.length){
            System.out.println("SUCCESS");
        }
    }
}