<!DOCTYPE html>
<html lang="en-GB">
 <head>
 
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width">
   <title>DaCA - Web Data Commons Analyzer </title>
   
 </head>
 
 <body prefix="schema: http://schema.org/ xsd: http://www.w3.org/2001/XMLSchema# sa: https://ns.science.ai/">
   
   <header>
     <p class="title">DaCA - Web Data Commons Analyzer</p>
	 <p class="subtitle">Techincal Report</p>
   </header>
  
  <article id="daca" typeof="schema:ScholaryArticle" resource="#">
     <h1> DaCA - Technical Report </h1>
	 
	 <section>
        <ol>
          <li property="schema:author" typeof="sa:ContributorRole">
            <a property="schema:author" typeof="schema:Person">
              <span property="schema:givenName">Vlas</span>
              <span property="schema:familyName">Catalin</span>
            </a>
          </li>
          <li property="schema:author" typeof="sa:ContributorRole">
            <a property="schema:author" typeof="schema:Person">
              <span property="schema:givenName">Hreapca</span>
              <span property="schema:familyName">Aurelian</span>
            </a>
          </li>
          <li property="schema:author" typeof="sa:ContributorRole">
            <a property="schema:author" typeof="schema:Person">
              <span property="schema:givenName">Barcan</span>
              <span property="schema:familyName">Virgil</span>
            </a>
          </li>
        </ol>
        <ol>
          <li id="institution">
            <a href="http://science.ai/" typeof="schema:Corporation">
              <span property="schema:name">Alexandru Ioan Cuza Uneversity, Faculty of Computer Science, Iasi </span>
            </a>
          </li>
        </ol>
	 </section>
	 
	 <section typeof="sa:Abstract" id="abstract">
        <h2>Abstract</h2>
        <p>
          DaCA will be a web tool able to perform various processing tasks regarding the meta-data available in RDFa and HTML5 microdata 
          formats provided by the Web Data Commons. Using a modular approach, a minimal set of operations are provided: visualize,
          clasify, compare, and match/align. Various statistics, modeled with the RDF Data Cube vocabulary, will be also exposed.
		  To use the tool, a user should create an account or register with facebook for example. After this he will be able to upload
		  files provided by Web Data Commons in N-Quads format. After the file is uploaded the user will be able to see the list of uploaded files 
		  in his personal dasboard, which will contain for each file some statistics like: number of nodes, number of connected graphs,
		  number of edges, etc. Also phisical information about uploaded files will be provided: internal id, file size, etc.
		  From dashboard page a user will be able to navigate to a visualisation page where he will see the list of graphs contained in uploaded 
		  datased as well as a graphical representation of those graphs. Here he will be able also to perform SPARQL queries againt loaded dataset.
		  This tool will aslo provide support for RDF graph conparison and match/align.  
        </p>
      </section>
	  
	  <section typeof="sa:ReferenceList" id="references">
        <h2>References</h2>
        <dl>
          <dt>Web Data Commons</dt>
          <dd id="ref-nyt" typeof="schema:ScholarlyArticle" resource="http://webdatacommons.org/structureddata/2016-10/stats/how_to_get_the_data.html">
            <cite property="schema:name"><a href="http://webdatacommons.org/structureddata/2016-10/stats/how_to_get_the_data.html">How to get data</a></cite>,
          </dd>
        </dl>
		
		<dl>
          <dt>Data Cube</dt>
          <dd id="ref-nyt" typeof="schema:ScholarlyArticle" resource="https://www.w3.org/TR/vocab-data-cube/">
            <cite property="schema:name"><a href="https://www.w3.org/TR/vocab-data-cube/">Modeling RDF Stats with Data Cube Vocabulary</a></cite>,
          </dd>
        </dl>
      </section>
	 
  </article>   
 
 </body>

</html>
