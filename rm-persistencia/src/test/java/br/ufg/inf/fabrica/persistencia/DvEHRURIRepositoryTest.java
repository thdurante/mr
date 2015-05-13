package br.ufg.inf.fabrica.persistencia;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.openehr.rm.datatypes.uri.DvEHRURI;
import org.openehr.rm.datatypes.uri.DvURI;

import java.util.UUID;

/**
 * Testes com DvURI.
 */
public class DvEHRURIRepositoryTest extends TestCase {

    private DataValueRepository repo;

    @Override
    public void setUp() {
        // Obtém repositório

        repo = new DataValueRepositoryRam();
    }

    public void testPersisteRecupera() {
        DvEHRURI ehruri = new DvEHRURI("https://github.com");

        String key = UUID.randomUUID().toString();

        repo.save(key, ehruri);

        Assert.assertEquals(ehruri, repo.get(key));
    }
}
