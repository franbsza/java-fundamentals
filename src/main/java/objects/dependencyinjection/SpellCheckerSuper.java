/*
Cap 2 Creating And Destroying Objects -
Item 5: Prefer dependency injection to hardwiring resources
 */

package objects.dependencyinjection;

import java.util.List;
import java.util.Objects;

public class SpellCheckerSuper {

        public class WrongSpellChecker {

            private final Lexicon dictionary = null;

            private WrongSpellChecker() {
            } // Noninstantiable

            public boolean isValid(String word) {
                return true;
            }

            public List<String> suggestions(String type) {

                return null;
            }
        }


        public class RightSpellChecker {

            private final Lexicon dictionary;

            public RightSpellChecker(Lexicon dictionary) {
                this.dictionary = Objects.requireNonNull(dictionary);
            }

            public boolean isValid(String word) {
                return true;
            }
            public List<String> suggestions(String typo) {
                return null;
            }
        }
}

