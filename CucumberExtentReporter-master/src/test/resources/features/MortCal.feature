Feature: verify Mortgage Calculator functionalscenario

Scenario: verify Mortgage Calculator functional
	Given  Cal web cal application
	When   User Clcks on Mortg Cal link
	Then   User clrs the default val in Home price txt fld
	Then   User entr the val n Home price txt fld
	Then   User clrs the default val n Dwnpymnt txt fld
	Then   User entr the val in Dwnpymnt txt fld
	Then   User clcks on cal btn
	Then   User cls the bwsr