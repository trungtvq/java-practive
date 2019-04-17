//package co.overlead.auth;
//
//import com.google.api.client.auth.oauth2.Credential;
//import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
//import com.google.api.client.json.JsonFactory;
//
//import java.util.Collections;
//
//public class Google {
//    private static final JsonFactory JSON_FACTORY = ;
//
//    /** Authorizes the installed application to access user's protected data. */
//    private static Credential authorize() throws Exception {
//        // load client secrets
//        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY,
//                new InputStreamReader(CalendarSample.class.getResourceAsStream("/client_secrets.json")));
//        // set up authorization code flow
//        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
//                httpTransport, JSON_FACTORY, clientSecrets,
//                Collections.singleton(CalendarScopes.CALENDAR)).setDataStoreFactory(dataStoreFactory)
//                .build();
//        // authorize
//        return new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver()).authorize("user");
//    }
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        AppIdentityCredential credential =
//                new AppIdentityCredential(Arrays.asList(UrlshortenerScopes.URLSHORTENER));
//        Urlshortener shortener =
//                new Urlshortener.Builder(new UrlFetchTransport(), new JacksonFactory(), credential)
//                        .build();
//        UrlHistory history = shortener.URL().list().execute();
//   ...
//    }
//
//
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        // Google Accounts
//        credential =
//                GoogleAccountCredential.usingOAuth2(this, Collections.singleton(TasksScopes.TASKS));
//        SharedPreferences settings = getPreferences(Context.MODE_PRIVATE);
//        credential.setSelectedAccountName(settings.getString(PREF_ACCOUNT_NAME, null));
//        // Tasks client
//        service =
//                new com.google.api.services.tasks.Tasks.Builder(httpTransport, jsonFactory, credential)
//                        .setApplicationName("Google-TasksAndroidSample/1.0").build();
//    }
//}
