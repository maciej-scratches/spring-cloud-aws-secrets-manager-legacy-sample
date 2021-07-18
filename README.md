# spring-cloud-aws-secrets-manager-legacy-sample

Example application fetching properties from AWS Secrets Manager. To run it with success, create a following secret Secrets Manager:

- key: `/secrets/spring-cloud-aws-sample-app`
- content: 

```
{
  "password": "some-pass"
}
```
