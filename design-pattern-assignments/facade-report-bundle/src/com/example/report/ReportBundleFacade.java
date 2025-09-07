public  class ReportBundleFacade {

    private final JsonWriter jsonWriter;
    private final Zipper zipper;
    private final AuditLog auditLog;

    public ReportBundleFacade(JsonWriter jsonWriter, Zipper zipper, AuditLog auditLog) {
        this.jsonWriter =  jsonWriter;
        this.zipper =  zipper;
        this.auditLog =  auditLog;
    }

    public Path export(Map<String,Object> data,Path outDir , String name){
        Objects.requireNonNull(data, "data");
        Objects.requireNonNull(outDir, "outDir");
        Objects.requireNonNull(baseName, "baseName");

        try{
        Path jsonFile = jsonWriter.write(data , outDir  , name);

        Path zipFile = zipper.zip(jsonFile , outDir.resolve(baseName + ".zip"));

        auditLog.log("Exported report path" + zipFile);

        return zipFile;
        }catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

}