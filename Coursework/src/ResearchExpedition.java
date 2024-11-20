public class ResearchExpedition {
    private ExpeditionMember expeditionLeader;
    private ExpeditionMember archivist;
    private ExpeditionMember fieldResearcher;

    ResearchExpedition(ExpeditionMember leader, ExpeditionMember archivist, ExpeditionMember fieldResearcher) {
        this.expeditionLeader = leader;
        this.archivist = archivist;
        this.fieldResearcher = fieldResearcher;
    }

    public String getExpeditionLeaderName() {
        return expeditionLeader.getName();
    }
    public String getArchivistName() {
        return archivist.getName();
    }
    public String getFieldResearcherName() {
        return fieldResearcher.getName();
    }

}
