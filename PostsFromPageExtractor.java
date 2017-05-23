import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.PagableList;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

public class PostsFromPageExtractor {

/**
 * A simple Facebook4J client which
 * illustrates how to access group feeds / posts / comments.
 * 
 * @param args
 * @throws FacebookException 
 */
public static void main(String[] args) throws FacebookException {

    // Generate facebook instance.
    Facebook facebook = new FacebookFactory().getInstance();
    // Use default values for oauth app id.
    facebook.setOAuthAppId("305490416553855", "9125cf5d3ea9a6a299d1681948a45f7f");
    // Get an access token from: 
    // https://developers.facebook.com/tools/explorer
    // Copy and paste it below.
    String accessTokenString = "EAACEdEose0cBAKSOHyjy4vAdkm8nGWDzgtZBVsuxqrOevv3VZBsBdbzoRZAFWJVoKWTe8PnaB5svx50LmA7ZCpnVYvypYdXF33op6sHkDpYOJ54CBUr2pkSm5RFZAHGCG7SGQaZCZADQpIZB4vZBKYdyZBw9QMIgn5M8cSuaGb8YdFaZCZBh7rHGsZBwinzf7FpU44Q8ZD";
    AccessToken at = new AccessToken(accessTokenString);
    // Set access token.
    facebook.setOAuthAccessToken(at);

  
            
            facebook.postStatusMessage("Hello World from Facebook4J.");
        }           
    
}