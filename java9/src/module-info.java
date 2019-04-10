module java9 {
    requires IDumpDataModule;
    requires IProcessModule;
    requires jdk.incubator.httpclient;
    uses running.IProcess;
}